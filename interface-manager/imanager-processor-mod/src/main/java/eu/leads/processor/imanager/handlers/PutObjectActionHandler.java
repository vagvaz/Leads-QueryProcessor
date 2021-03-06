package eu.leads.processor.imanager.handlers;

import eu.leads.processor.common.infinispan.InfinispanManager;
import eu.leads.processor.core.Action;
import eu.leads.processor.core.ActionHandler;
import eu.leads.processor.core.ActionStatus;
import eu.leads.processor.core.PersistenceProxy;
import eu.leads.processor.core.comp.LogProxy;
import eu.leads.processor.core.net.Node;
import org.infinispan.Cache;
import org.vertx.java.core.json.JsonObject;

/**
 * Created by vagvaz on 8/6/14.
 */
public class PutObjectActionHandler implements ActionHandler {

   Node com;
   LogProxy log;
   InfinispanManager persistence;
   String id;

   public PutObjectActionHandler(Node com, LogProxy log, InfinispanManager persistence, String id) {
      this.com = com;
      this.log = log;
      this.persistence = persistence;
      this.id = id;
   }

   @Override
   public Action process(Action action) {
      Action result = action;
      JsonObject actionResult = new JsonObject();
      try {
         String cacheName = action.getData().getString("table");
         String key = action.getData().getString("key");
         JsonObject value = new JsonObject(action.getData().getString("object"));
         Cache<String, String> cache = (Cache<String, String>) persistence.getPersisentCache(cacheName);
         cache.put(key, value.toString());
         actionResult.putString("status", "SUCCESS");
      } catch (Exception e) {
         actionResult.putString("status", "FAIL");
         actionResult.putString("error", "");
         actionResult.putString("message",
                                       "Could not store object " + action.getData().toString());
         System.err.println(e.getMessage());
      }
      result.setResult(actionResult);
      result.setStatus(ActionStatus.COMPLETED.toString());
      return result;
   }
}

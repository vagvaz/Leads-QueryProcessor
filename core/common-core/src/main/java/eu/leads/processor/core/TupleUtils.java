package eu.leads.processor.core;

/**
 * Created by vagvaz on 9/24/14.
 */
public class TupleUtils {
   public static int compareValues(Object o1, Object o2, String type) {
      int result = 0;
      if(type.startsWith("TEXT")){
         String v1 = (String)o1;
         String v2 = (String)o2;
         result = v1.compareTo(v2);
      }
      else if (type.startsWith("BOOLEAN")){
         Boolean v1 = (Boolean)o1;
         Boolean v2 = (Boolean)o2;
         result = v1.compareTo(v2);
      }
      else if(type.startsWith("INT")){
         Integer v1 = (Integer)o1;
         Integer v2 = (Integer)o2;
         result = v1.compareTo(v2);
      }
      else if(type.startsWith("FLOAT") || type.startsWith("DOUBLE")){
         Double v1 = (Double)o1;
         Double v2 = (Double)o2;
         result = v1.compareTo(v2);
      }

      return result;
   }
}

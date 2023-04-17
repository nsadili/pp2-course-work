public class Practice{
    public static void main(String[] args){
        AFuncInt obj = new AFuncInt() {
         public void apply(String str){
            return;
         }
        };
        obj.apply(null);
        obj.print("salam", "aleykum");
        AFuncInt.print("asfass");

        AFuncInt obj2 = (str) -> {};
        obj2.print("saf", "asfa");
    }

    interface AFuncInt{
        public void apply(String str);
        public static void print(String str){
            System.out.println(str);
        };
        public default void print(String str1, String str2){
            System.out.println(str1 + " " + str2);
        }
    }
}
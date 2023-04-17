public interface AFuncInt{

  void apply(String str);
    static void println(String str){

System.put.println("STATIC ->" + str);
}
default void print(String str1, String str2){
    System.out.println("Default -> " + str1 + " ; " + str2);

}


};


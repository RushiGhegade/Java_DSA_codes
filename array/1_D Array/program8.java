 class outer {
        static void gun(){
                System.out.println("in outer fun method");
        }
        class inner{
                static void fun(){
                        System.out.println("in inner fun method");
                }
        }
        /*public static void main(String args[]){
                outer obj=new outer();
                obj.fun();

                fun();

                inner obj1=new outer().new inner();
                obj1.fun();

        }*/
}

class program8{
        public static void main(String args[]){
                outer.gun();

                // outer.inner obj=new outer().new inner();
                //obj.fun();
                outer.inner.fun();

        }
}
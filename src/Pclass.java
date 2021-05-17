class Pclass {
    public void pmethod() {
        System.out.println("This is the parent class");
    }
}
class Cclass extends Pclass{
    public void cmethod(){
        System.out.println("This is the child class");

    }
   }
class Answ{
    public static void main(String[] args){
        Pclass m = new Pclass();
        Cclass n = new Cclass();
        m.pmethod();
        n.cmethod();
        n.pmethod();
    }

}
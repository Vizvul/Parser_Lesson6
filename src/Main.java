public class Main {
    public static void main(String[] args) {

        SpaceNormalased str = new AutoSpaceNormalased();
        String strtest1 = str.normalasedSpace(" , as    as,da   fgfg  ");
        System.out.println(strtest1);
        String strtest2 = str.normalasedSpace(" a,   bb  c ");
        System.out.println(strtest2);
        String strtest3 = str.normalasedSpace("a  ,  ,bb  c ,");
        System.out.println(strtest3);
    }
}

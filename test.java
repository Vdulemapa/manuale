public class test {

        String name;
        int age;

        public static void main(String[] args) {
            test barsik = new test();
            barsik.age = 3;
            barsik.name = "Барсик";

            System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        }


}

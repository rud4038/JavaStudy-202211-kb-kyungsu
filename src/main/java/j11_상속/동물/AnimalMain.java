package j11_상속.동물;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal hAnimal = human; // 업캐스팅
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[5];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println("[업캐스팅]");
        for(int i = 0; i < animals.length; i++){
            animals[i].move();
        }
        System.out.println("[다운캐스팅]");
        for(int i = 0; i < animals.length; i++) { //다운캐스팅
            if(animals[i] instanceof Human) {
                Human h = (Human) animals[i];
                h.readBooks();
            }else if(animals[i] instanceof Tiger){
                Tiger t = (Tiger) animals[i];
                t.hunting();
            }else{
                System.out.println("다운캐스팅 불가");
            }
        }
    }

}

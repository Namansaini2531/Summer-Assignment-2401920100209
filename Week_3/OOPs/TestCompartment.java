public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];

        for(int i = 0; i < 10; i++) {
            int r = (int)(Math.random() * 4) + 1;
            if(r == 1){
                compartments[i] = new FirstClass();
            }
            else if(r == 2){
                compartments[i] = new Ladies();
            }
            else if(r == 3){
                compartments[i] = new General();
            }
            else{  
                compartments[i] = new Luggage();
            }
        }

        for(int i = 0; i < 10; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}

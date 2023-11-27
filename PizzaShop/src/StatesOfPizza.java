//order takes 5 min
//ready takes 2 min
//delivered takes 0 min
// isDelivered();
// isOrdered();
//isReady();
//printTime();

public enum StatesOfPizza {
    ORDERED(5) {
        @Override
        public boolean isOrdered() {
            return true;

        }
    },
    READY(2) {
        @Override
        public boolean isReady() {
            return true;
        }
    },
    DELIVERED(0){
        @Override
        public boolean isDelivered() {
            return true;
        }
    };

    StatesOfPizza(int time) {
        this.time=time;

    }

    public boolean isDelivered(){
        return false;
    }

    public boolean isOrdered(){
        return false;
    }

    public boolean isReady(){
        return false;
    }

    public void printTime(){
        System.out.println(time);
    }

    private int time;

}

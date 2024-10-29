public abstract class Animal {



        protected Isound sound;
        public void setSound(Isound newSound) {
            sound = newSound;
        }

        public void makeSound() {
            sound.sound();
        }

        public abstract void display();

        @Override
        public String toString() {
            return "Animal{" +
                    "sound=" + sound +
                    '}';
        }
    }
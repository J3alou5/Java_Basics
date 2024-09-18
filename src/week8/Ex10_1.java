package week8;

    public class Ex10_1 implements Ex10 {
        private int daysLeft;

        public Ex10_1(int daysLeft) {
            this.daysLeft = daysLeft;
        }

        public int getDaysLeft() {
            return daysLeft;
        }

        public void work() {
            if (daysLeft > 0) {
                daysLeft--;
            }
        }
        public static void main(String[] args) {
            Ex10 civilService = new Ex10_2();
            Ex10 militaryService = new Ex10_1(300);

            System.out.println("Civil Service Days Left: " + civilService.getDaysLeft());
            civilService.work();
            System.out.println("Civil Service Days Left after working: " + civilService.getDaysLeft());

            System.out.println("Military Service Days Left: " + militaryService.getDaysLeft());
            militaryService.work();
            System.out.println("Military Service Days Left after working: " + militaryService.getDaysLeft());

            // Testing CivilService until daysLeft becomes 0
            for (int i = 0; i < 362; i++) {
                civilService.work();
            }
            System.out.println("Civil Service Days Left after all work: " + civilService.getDaysLeft());

            // Testing MilitaryService until daysLeft becomes 0
            for (int i = 0; i < 300; i++) {
                militaryService.work();
            }
            System.out.println("Military Service Days Left after all work: " + militaryService.getDaysLeft());
        }
    }

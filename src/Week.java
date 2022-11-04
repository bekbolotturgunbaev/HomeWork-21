public enum Week {
    MONDAY {
        @Override
        public void day() {
            System.out.println("куну Java окуйм");
        }
    },
    TUESDAY {
        @Override
        public void day() {
            System.out.println("куну Английский жана Практика отобуз");
        }
    },
    WEDNESDAY {
        @Override
        public void day() {
            System.out.println("куну Java окуйм");
        }
    },
    THURSDAY {
        @Override
        public void day() {
            System.out.println("куну SoftSkills жана Практика отобуз");
        }
    },
    FRIDAY {
        @Override
        public void day() {
            System.out.println("куну Java окуйм");
        }
    },
    SATURDAY {
        @Override
        public void day() {
            System.out.println("куну Практика отобуз");
        }
    },
    SUNDAY {
        @Override
        public void day() {
            System.out.println("куну выходной");
        }
    };

    public abstract void day();
}

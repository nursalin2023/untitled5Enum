public enum Week {

        PANIDELNIK("sabak"),
        FTORNIK("seyshen"),
        CREDA("sabak"),
        CHETVERT("saysen"),
        PIATNISA("sabak"),
        SUBOTA("englesh i saysen"),
        VOSKRESENIE("fodbool");

        private  final String weekks;



    Week(String weekks) {
        this.weekks = weekks;
    }

    public String getWeekks() {
            return weekks;
        }

        @Override
        public String toString() {
            return weekks ;
        }
    }


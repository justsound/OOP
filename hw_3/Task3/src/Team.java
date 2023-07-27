public class Team {
        private String type;
        private String name;
        private Double budget;
        private int rate;

        public Team (String type, String name, Double budget, int rate){
            this.type = type;
            this.name = name;
            this.budget = budget;
            this.rate = rate;
        }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Double getBudget() {
        return budget;
    }

    public int getRate() {
        return rate;
    }

    @Override
        public String toString() {
            return "Team{" +
                    "type" + type +
                    "name='" + name + '\'' +
                    ", budget=" + budget +
                    ", rate" + rate +
                    "}";
        }
}

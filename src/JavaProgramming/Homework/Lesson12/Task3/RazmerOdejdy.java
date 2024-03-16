package JavaProgramming.Homework.Lesson12.Task3;

public enum RazmerOdejdy {
    XXS(42){
        @Override
        public String getDescription() {
            return "Detskaya odejda";
        }
    },
    XS(44),
    S(46),
    M(48),
    L(50);

    RazmerOdejdy(int euroSize) {
        this.euroSize = euroSize;
    }

    int euroSize;

    public String getDescription() {
        return "Vzroslaya odejda";
    }


}

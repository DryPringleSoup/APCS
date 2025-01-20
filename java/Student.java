public class Student {
    private String name;
    private String OSIS;
    private String grade_level;

    public Student() {
        this.name = "Default Name";
        this.OSIS = "0000000000";
        this.grade_level = "9th grade";
    }

    public Student(String name, String OSIS, String grade_level) {
        this.name = name;
        this.OSIS = OSIS;
        this.grade_level = grade_level;
    }

    public String getName() { return name; }
    public String getOSIS() { return OSIS; }
    public String getGrade() { return grade_level; }

    public String getRandomOSIS() { return ""+((long) ((Math.random()+1)*10000000000L)); }
    public String getRandomName() {
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String rName = "";
        char rChar;
        
        for (int i = 0; i < 2; i++) { // First and last
            for (int j = 0; j < (int) (Math.random()*4+3); j++) {
                // Higher chance for vowels 
                if (Math.random() > 0.55) rChar = vowels.charAt((int) (Math.random()*5));
                else rChar = consonants.charAt((int) (Math.random()*21));
                // ASCII arithmetic to convert first char to uppercase
                if (j == 0) rChar = (char) (rChar-32);

                rName += rChar;
            }
            rName += " ";
        }

        return rName;
    }
}

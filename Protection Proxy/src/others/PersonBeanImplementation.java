package others;

public class PersonBeanImplementation implements PersonBean {

    private String name;
    private String gender;
    private String interest;
    private int rating;
    private int ratingCount = 0;

    public PersonBeanImplementation(String name, String gender, String interest) {
        this.name = name;
        this.gender = gender;
        this.interest = interest;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getGender() {
        return this.gender;
    }
    @Override
    public String getInterests() {
        return this.interest;
    }
    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0) return 0;
        else return (rating/ratingCount);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public void setInterests(String interests) {
        this.interest = interests;
    }
    @Override
    public void setHotOrNotRating(int rating) {
        this.rating+=rating;
        ratingCount++;
    }
}

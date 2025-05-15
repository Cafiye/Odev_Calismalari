public class PersonalInformation {
    private String name;
    private String surname;
    private String id;

    PersonalInformation(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Adı: " + name ;
    }
}

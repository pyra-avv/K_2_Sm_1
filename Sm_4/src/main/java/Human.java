public class Human {
    private String surname;
    private String name;
    private String patronymic;
    private Data Birth;
    public Human() {
        setName("Иван");
        setSurname("Иванов");
        setPatronymic("Иванович");
        setBirth(new Data());
    }
    public Human(String nemeH, String surnemeH, String patronymicH, Data BirthH) {
        setName(nemeH);
        setSurname(surnemeH);
        setPatronymic(patronymicH);
        setBirth(BirthH);
    }
    public int Age(Data data) {
        String[] arr = { "январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь",
                "октябрь", "ноябрь", "декабрь" };
        int CurrentMonth = -1;
        int MonthBirth = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(data.getMonth())) {
                CurrentMonth = i;
            }
            if (arr[i].equals(Birth.getMonth())) {
                MonthBirth = i;
            }
        }
        if (CurrentMonth < MonthBirth || (CurrentMonth == MonthBirth && Birth.getDey() > data.getDey())) {
            return data.getYear() - Birth.getYear() - 1;
        }
        return data.getYear() - Birth.getYear();
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public Data getBirth() {
        return Birth;
    }
    public void setBirth(Data birth) {
        Birth = birth;
    }
}

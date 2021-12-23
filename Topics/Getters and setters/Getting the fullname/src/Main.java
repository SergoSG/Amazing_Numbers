
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String str1 = "";
        String str2 = "";
        if (!this.firstName.isEmpty()) {
            str1 = this.firstName;
        }
        if (!this.lastName.isEmpty()) {
            if (this.firstName.isEmpty()) {
                str2 = this.lastName;
            } else {
                str2 = " ".concat(this.lastName);
            }
        }
        if (str1.isEmpty() && str2.isEmpty()) {
            return "Unknown";
        } else {
            return str1.concat(str2);
        }
    }
}
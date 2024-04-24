class Staff extends Person {
    public String role;

    public Staff(String name, int id, String role) {
        super(name, id);
        this.role = role;
    }
    public String getrole() {
        return role;
    }
}
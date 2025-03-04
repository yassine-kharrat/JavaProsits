package tn.esprit.gestionzoo.entities;

class ZooFullException extends Exception {
    public ZooFullException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
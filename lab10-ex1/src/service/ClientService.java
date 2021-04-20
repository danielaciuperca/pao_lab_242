package service;

import model.*;

import java.util.*;

public class ClientService {
    public List<Client> getClients() {
        return List.of(
                new Client("Adrian Popescu", "Blv.Dacia Nr.30 Bucuresti",
                        "apopescu@gmail.com"),
                new Client("Maria Ionescu", "Blv.Unirii Nr.5 Timisoara",
                        "mionescu@gmail.com"),
                new Client("Ion Georgescu", "Str.Florilor Nr.14 Brasov",
                        "igeorgescu@yahoo.com"),
                new Client("Razvan Teodorescu", "Blv.Grigorescu Nr.235 Bucuresti",
                        "rteodorescu@gmail.com"),
                new Client("Elena Vasilescu", "Blv.Aerogarii Nr.67 Brasov",
                        "vasilescuelena@gmail.com"),
                new Client("Alexandra Ionescu", "Blv.Eroilor Nr.76 Bucuresti",
                        ""),
                new Client("Stefan Radulescu", "Blv.Pacii Nr.45 Iasi",
                        "radulescust@gmail.com"),
                new Client("Alexandru Grigorescu", "Str.Neamtului Nr.89 Iasi",
                        "alexgrigorescu@gmail.com")
        );
    }
}

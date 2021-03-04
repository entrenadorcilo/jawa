package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class Worker {
    private String Name;

    private Set<RepairType> abilities = new HashSet<RepairType>();

    public Worker(String s) {

    }
}

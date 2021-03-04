package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter

public class RepairService {
    private Map<Department,Department> departmentMap = new HashMap();
}

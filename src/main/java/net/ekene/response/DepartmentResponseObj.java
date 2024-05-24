package net.ekene.response;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentResponseObj {
    private String departmentName;
    private String headOfDepartment;
}

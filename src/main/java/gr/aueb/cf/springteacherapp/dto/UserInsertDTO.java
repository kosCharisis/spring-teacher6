package gr.aueb.cf.springteacherapp.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInsertDTO {

//    @NotEmpty(message = "Username is required")
//    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
//    private String username;

    @NotEmpty(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    private String role; // assuming you want the user to select a role


    @Email
    private String username;
//
//    @NotNull
//    @Pattern(regexp = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?\\d)(?=.*?[@$!%*?&]).{5,}$", message = "Invalid password")
//    private String password;
//
//    private String role;
}

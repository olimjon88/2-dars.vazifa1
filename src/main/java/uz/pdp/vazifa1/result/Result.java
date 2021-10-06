package uz.pdp.vazifa1.result;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Result {
    private String message;

    private Boolean status;
}

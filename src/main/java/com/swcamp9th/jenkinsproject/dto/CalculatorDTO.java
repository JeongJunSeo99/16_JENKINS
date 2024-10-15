package com.swcamp9th.jenkinsproject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {

    // 매개변수 있는 생성자 만드는 방법. @NonNull이 붙은 필드값이 있다면 해당 필드값 조합으로 매개변수 있는 생성자 만들어짐
    @NonNull
    private int num1;

    @NonNull
    private int num2;
    private int sum;

}

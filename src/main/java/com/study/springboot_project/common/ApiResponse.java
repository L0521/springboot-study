// ApiResponse.java
// 스터디 사전 준비 과제 제출용
@Getter
@AllArgsConstructor
public class ApiResponse<T> {
    private boolean isSuccess;
    private String code;
    private String message;
    private T result;

    public static <T> ApiResponse<T> onSuccess(T result) {
        return new ApiResponse<>(true, "COMMON200", "요청에 성공하였습니다.", result);
    }
}
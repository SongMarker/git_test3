import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. 정렬할 테스트 배열을 선언하고 초기화합니다.
        int[] a = { 4, 8, 2, 6, 10, 3, 1, 7, 9, 5 };

        // 2. Sort 클래스의 sort 메서드를 호출하여 배열 a를 정렬합니다.
        Sort.sort(a);

        // 3. 정렬된 결과를 보기 좋게 문자열로 변환하여 출력합니다.
        System.out.println(Arrays.toString(a));
    }
}
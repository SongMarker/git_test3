public class Sort {
    public static void sort(int[] a) {
        // 배열의 두 번째 요소(인덱스 1)부터 시작합니다.
        for (int i = 1; i < a.length; ++i) {
            // 현재 삽입될 숫자인 i번째 요소를 'value' 변수에 저장합니다.
            int value = a[i];
            int j; // 'value'가 들어갈 위치를 찾기 위한 인덱스입니다.

            // i 이전의 정렬된 배열 부분을 역순으로 탐색합니다.
            for (j = i - 1; j >= 0; --j) {
                // 현재 요소(value)보다 큰 값을 만나면
                if (a[j] > value) {
                    // 해당 값을 오른쪽으로 한 칸 이동시킵니다.
                    a[j + 1] = a[j];
                } else {
                    // 자기보다 작거나 같은 값을 만나면 그 위치가 삽입 지점이므로 멈춥니다.
                    break;
                }
            }
            // 찾은 위치(j + 1)에 'value'를 삽입합니다.
            a[j + 1] = value;
        }
    }
}
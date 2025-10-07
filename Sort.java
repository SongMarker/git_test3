public class Sort {

    /**
     * 정렬을 시작하는 public 메서드입니다.
     */
    public static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    /**
     * 배열의 두 요소 위치를 바꾸는 헬퍼(helper) 메서드입니다.
     */
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 퀵 정렬의 핵심 파트. 피벗(pivot)을 기준으로 배열을 나누고 피벗의 최종 위치를 반환합니다.
     * (현재는 구현이 필요합니다)
     */
    static int partition(int[] a, int start, int end) {
        // TODO: partition 알고리즘을 구현해야 함
        
        // 컴파일 오류를 막기 위해 임시로 start 값을 반환하도록 추가했습니다.
        // 실제 구현 시에는 피벗의 인덱스를 반환해야 합니다.
        return start; 
    }

    /**
     * 퀵 정렬을 재귀적으로 수행하는 메인 로직입니다.
     */
    static void quickSort(int[] a, int start, int end) {
        // 시작 인덱스가 끝 인덱스보다 크거나 같으면 정렬할 원소가 1개 이하이므로 종료합니다.
        if (start >= end) {
            return;
        }

        // partition 메서드를 통해 피벗의 위치(middle)를 찾습니다.
        int middle = partition(a, start, end);

        // 피벗을 기준으로 왼쪽 부분 배열을 재귀적으로 정렬합니다.
        quickSort(a, start, middle - 1);

        // 피벗을 기준으로 오른쪽 부분 배열을 재귀적으로 정렬합니다.
        quickSort(a, middle + 1, end);
    }
}
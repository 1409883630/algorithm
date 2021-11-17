//278. ��һ������İ汾
//���ǲ�Ʒ����Ŀǰ���ڴ���һ���Ŷӿ����µĲ�Ʒ�����ҵ��ǣ�
//��Ĳ�Ʒ�����°汾û��ͨ��������⡣����ÿ���汾���ǻ���֮ǰ�İ汾�����ģ�
//���Դ���İ汾֮������а汾���Ǵ�ġ�
//�������� n ���汾 [1, 2, ..., n]�������ҳ�����֮�����а汾����ĵ�һ������İ汾��
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) { // ѭ��ֱ���������Ҷ˵���ͬ
            int mid = left + (right - left) / 2; // ��ֹ����ʱ���
            if (isBadVersion(mid)) {
                right = mid; // �������� [left, mid] ��
            } else {
                left = mid + 1; // �������� [mid+1, right] ��
            }
        }
        // ��ʱ�� left == right��������Ϊһ���㣬��Ϊ��
        return left;
    }
}


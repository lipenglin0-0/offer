package Chapter6;

/**
 * 面试题41-题目2：和为S的连续正数序列
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 输出描述:
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */

public class _41_positive_sequence {
	public static void main(String[] args) {
		new _41_functionI().find_sequence(15);
	}
}

class _41_functionI {
	/*
	 * 序列求和
	 */
	void find_sequence(int key) {
		int begin = 1;
		int end = 2;
		while(begin <= end && end <= key + 1 >> 1) {
			int tmp = sum(begin, end);
			if (tmp < key) end++;
			else if (tmp > key) begin++;
			else System.out.println(key + "/ " + begin++ + " ~ " + end++);
		}
	}
	int sum(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}

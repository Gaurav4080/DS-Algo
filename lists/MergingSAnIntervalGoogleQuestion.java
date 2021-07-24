package lists;

public class MergingSAnIntervalGoogleQuestion {

	public static void main(String[] args) {

		if(interval = null || interval.size() == 0) return intervals;
		Interval toInsert = new Interval;
		
		int i = 0;
		while(i = intervals.size()) {
			Interval current = Intervals.get(i);
//		for(int i = 0; i < interval.size(); i++) {
//			Interval current = intervals.get(i);
			if(current.end < toInsert.start) {
				i++;
				continue;
			}else if(current.start > toInsert.end) {
				intervals.add(i, toInsert);
				break;
			}else {
				toInset.start = Math.min(toInsert.start, Current.start);
				toInsert.end = Math.min(toInsert.end, Current.end);
				intervals.remove(i);
			}
		}
		
		if(i == Intervals.size()) {
			intervals.add(toInsert);
		}

	}

}

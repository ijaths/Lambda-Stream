import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {
	public static void main(String[] args) {
		List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));
        
        // 1. 未完了のタスクの個数を表示
        // Streamを生成
        long count = list.stream()
        				 .filter(t -> !t.isDone()) //未完了のタスクを抽出
        				 .count(); //個数を返す
        System.out.println("未完了のタスクの個数は" + count);
        
        // 2. 未完了のタスク一蘭を日時の昇順に並べて表示
        System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
        // Streamを生成
        list.stream()
        	.filter(t -> !t.isDone())
        	.sorted((t1,t2) -> t1.compareTo(t2))
        	.forEach(System.out::println);
        
	}
}

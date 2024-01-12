package java2;

public class Main {
	public static void main(String[] args) {
//		初期化、繰り返し条件、処理
		for(int i=1; i<=10; i++){
//			iが偶数である場合
			if(i % 2 == 0){
//				2 4 6 8 10と繰り返し出力されるiにスペースを入れる
//				printlnにすると出力が縦書きになる
				System.out.print(i+" ");
				}
			}
//		空の行を出力する。無くてもここでは結果は同じ
		System.out.println();
		}
	}
	
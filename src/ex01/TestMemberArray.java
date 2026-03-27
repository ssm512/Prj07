package ex01;

import java.util.Objects;

class Member {
	//field
	private		int			num;
	private		String		name;
	private		String		tel;
	
	// constructor
	public	Member() {}

	public Member(int num, String name, String tel) {
		this();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}
	
	// method
	// toString
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}
	

	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(name, num);
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;
		return num == other.num; 
		// && Objects.equals(name, other.name) ;
	}
	
	
} // class Member end

public class TestMemberArray {

	public static void main(String[] args) {
		// 여러명의 정보를 입력받아
		// 검색객체를 만들어서 해당 멤버를 찾는다
		
		
		
		/*
		Member		m1		=	new		Member(1, "민지", "010-0123-4567");
		Member		m2		=	new		Member(2, "원영", "010-2345-6789");
		Member		m3		=	new		Member(3, "윈터", "010-0123-4568");
		Member		m4		=	new		Member(4, "유진", "");			//	빈문자열
		Member		m5		=	new		Member(5, "유나", "010-0123-4560");
		Member		m6		=	new		Member(6, "닝닝", null);		//	null
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		*/
		
		Member[]	mArr		=	new	Member[6]; // heap에 배열을 만드는 생성자
		mArr[0]					=	new		Member(1, "민지", "010-0123-4567");	// 만들어진 heap의 배열에 값을 넣는 
		mArr[1]					=	new		Member(2, "원영", "010-2345-6789");
		mArr[2]					=	new		Member(3, "윈터", "010-0123-4568");
		mArr[3]					=	new		Member(4, "유진", "");			//	빈문자열
		mArr[4]					=	new		Member(5, "유나", "010-0123-4560");
		mArr[5]					=	new		Member(6, "닝닝", null);		//	null - heap 공간 자체가 안 만들어진거
		
		for (Member member : mArr) {	//	배열 출력
			System.out.println(member);
		}
		System.out.println("-------------------");
		// 찾을 사람의 정보
		Member	mem		=	new Member(3, "윈영", null);
		
		 //	== 주소비교, 주소 비교로는 찾을 수 없다
		boolean		isFound	=	false;
		for (int i = 0; i < mArr.length; i++) {
			Member member = mArr[i];
			//System.out.println("member" + member.hashCode());
			//System.out.println();
			//System.out.println("member" + mem.hashCode());
			if (member.equals(mem)) {
				System.out.println(member);
				isFound = true;
				break;	// 반복문 탈출
			} // if 문 end
		
		} // for 문 end
		
		// 못찾음
		if ( !isFound ) 
			System.out.println("못찾음");
		
	} // main end

} // class TestMemberArray end

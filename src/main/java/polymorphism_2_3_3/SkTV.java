package polymorphism_2_3_3;

public class SkTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("SkTV -- ������ �Ҵ�");
	}

	@Override
	public void powerOff() {
		System.out.println("SkTV -- ������ ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("SkTV -- ������ ���δ�");
	}

	@Override
	public void volumeDown() {
		System.out.println("SkTV -- ������ �����");
	}

}

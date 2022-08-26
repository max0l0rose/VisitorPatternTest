
class B extends A
{
//	@Override
//	void f(I1 i) {
//		i.func(this);
//	}

	@Override
	void f(Visitor v) {
		v.visit(this);
	}
}

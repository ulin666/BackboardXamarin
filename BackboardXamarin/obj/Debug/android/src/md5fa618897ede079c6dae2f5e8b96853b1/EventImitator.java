package md5fa618897ede079c6dae2f5e8b96853b1;


public abstract class EventImitator
	extends md5fa618897ede079c6dae2f5e8b96853b1.Imitator
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("com.tumblr.backboard.EventImitator, BackboardLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", EventImitator.class, __md_methods);
	}


	public EventImitator () throws java.lang.Throwable
	{
		super ();
		if (getClass () == EventImitator.class)
			mono.android.TypeManager.Activate ("com.tumblr.backboard.EventImitator, BackboardLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public EventImitator (double p0, int p1, int p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == EventImitator.class)
			mono.android.TypeManager.Activate ("com.tumblr.backboard.EventImitator, BackboardLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Double, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}

	public EventImitator (com.facebook.rebound.Spring p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == EventImitator.class)
			mono.android.TypeManager.Activate ("com.tumblr.backboard.EventImitator, BackboardLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Com.Facebook.Rebound.Spring, ReboundDroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}

	public EventImitator (com.facebook.rebound.Spring p0, int p1, int p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == EventImitator.class)
			mono.android.TypeManager.Activate ("com.tumblr.backboard.EventImitator, BackboardLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Com.Facebook.Rebound.Spring, ReboundDroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}

	public EventImitator (com.facebook.rebound.Spring p0, double p1, int p2, int p3) throws java.lang.Throwable
	{
		super ();
		if (getClass () == EventImitator.class)
			mono.android.TypeManager.Activate ("com.tumblr.backboard.EventImitator, BackboardLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Com.Facebook.Rebound.Spring, ReboundDroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null:System.Double, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

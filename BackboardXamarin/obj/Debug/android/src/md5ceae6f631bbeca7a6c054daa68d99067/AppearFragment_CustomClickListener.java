package md5ceae6f631bbeca7a6c054daa68d99067;


public class AppearFragment_CustomClickListener
	extends md5ceae6f631bbeca7a6c054daa68d99067.AppearFragment
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("BackboardXamarin.AppearFragment+CustomClickListener, BackboardXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AppearFragment_CustomClickListener.class, __md_methods);
	}


	public AppearFragment_CustomClickListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AppearFragment_CustomClickListener.class)
			mono.android.TypeManager.Activate ("BackboardXamarin.AppearFragment+CustomClickListener, BackboardXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
public interface Suara 
{
	public String getSuara();

	default void Ubah(Ubah ubah) 
	{
		ubah.suara = this;
	}
}
//way-2
public class Instagram
{
static Instagram i1;
static int count=0;

static
{
	i1=new Instagram();
}

int totalUploadedPhotos;

private Instagram()
{
	System.out.println("Account created Successfully...");
}

void uploadPhoto(int photos)
{
	System.out.println(photos+" photos uploaded succsefully...");
	totalUploadedPhotos=totalUploadedPhotos+photos;
	System.out.println("Total uploaded photos: "+totalUploadedPhotos);
}

static Instagram getInstagram()
{
	return i1;
}
}


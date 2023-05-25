/*Water*/
protected PireWater(android.os.Parcel in){
        // TODO: 24/05/2023
}

@Override
public int describeContents(){
        return 0;
}

@Override
public void writeToParcel(@android.support.annotation.NonNull android.os.Parcel dest,int flags){
        // TODO: 24/05/2023
}

public static final android.os.Parcelable.Creator<Pire> CREATOR=new Parcelable.Creator<Pire>(){
@Override
public Pire createFromParcel(Parcel in){
        return newPire(in);
}

@Override
public Pire[]newArray(int size){
        return newPire[size];
        }
};
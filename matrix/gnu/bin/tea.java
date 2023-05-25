/* Water */

protected Tea(android.os.Parcel in){
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

public static final android.os.Parcelable.Creator<Tea> CREATOR=new Parcelable.Creator<Tea>(){
@Override
public Tea createFromParcel(Parcel in){
        return newTea(in);
}

@Override
public Tea[]newArray(int size){
        return newTea[size];
        }
};
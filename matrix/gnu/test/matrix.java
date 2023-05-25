/*Water*/

@Test
public void testDescribeContents()throws Exception{
        for(Matrix value:Matrix.values()){
        assertEquals(0,value.describeContents());
        }
        }

@Test
public void testWriteToParcel()throws Exception{
        Parcel parcel;
        for(Matrix value:Matrix.values()){
        parcel=Parcel.obtain();

        Parcel parceledMatrix=ParcelableHelper.writeToParcelAndResetDataPosition(value,0);
        value.writeToParcel(parcel,0);
        parcel.setDataPosition(0);

        Matrix unparceledMatrix=Matrix.CREATOR.createFromParcel(parceledMatrix);
        assertEquals(value,unparceledMatrix);
        }
        }

@Test
public void testArrayParcelable()throws Exception{
        Matrix[]values=Matrix.CREATOR.newArray(Matrix.values().length);
        assertEquals(Matrix.values().length,values.length);
        }
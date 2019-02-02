package com.radha.kanchimap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
//import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.BitmapDescriptor;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements
        OnMapReadyCallback
{

    private static final LatLng UlagalandaPerumalTemple= new LatLng(12.839163905230098,79.70505611464324);
    private static final LatLng KumaraKottam  = new LatLng(12.8416963,79.7014139);
    private static final LatLng VaradarajaPerumalTemple = new LatLng(12.819076392236463,79.72381645995834);
    private static final LatLng KailasanatharTemple = new LatLng(12.842159419962174,79.68984603881837);
    private static final LatLng KamakshiAmmanTemple = new LatLng(12.84070446020349,79.70326634949839);
    private static final LatLng KachabeshwarTemple = new LatLng(12.838325630042789,79.70097720623018);
    private static final LatLng AdhiKamakshiAmman = new LatLng(12.8418315,79.7000025);
    private static final LatLng ChitraguptaTemple = new LatLng(12.837154037285181,79.70476448535919);
    private static final LatLng EkambareswararTemple = new LatLng(12.84723269462047,79.69975411891939);
    private static final LatLng SankaraMutt = new LatLng(12.843022406901547,79.70067143440248);

    private Marker mUlagalandaPerumalTemple;
    private Marker mKumaraKottam;
    private Marker mVaradarajaPerumalTemple;
    private Marker mKailasanatharTemple;
    private Marker mkamakshiAmmanTemple;
    private Marker mKachabeshwarTemple;
    private Marker mAdhiKamakshiAmman;
    private Marker mChitraguptaTemple;
    private Marker mEkambareswararTemple;
    private Marker mSankaraMutt;


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        List<Marker> markerList = new ArrayList<>();

        mUlagalandaPerumalTemple=mMap.addMarker(new MarkerOptions()
        .position(UlagalandaPerumalTemple)
        .title("Ulagalanda Perumal Temple"));
        mUlagalandaPerumalTemple.setTag(0);
        markerList.add(mUlagalandaPerumalTemple);

        mKumaraKottam=mMap.addMarker(new MarkerOptions()
        .position(KumaraKottam)
        .title("Kumara Kottam"));
        mKumaraKottam.setTag(0);
        markerList.add(mKumaraKottam);

        mVaradarajaPerumalTemple=mMap.addMarker(new MarkerOptions()
        .position(VaradarajaPerumalTemple)
        .title("Varadaraja Perumal Temple"));
        mVaradarajaPerumalTemple.setTag(0);
        markerList.add(mVaradarajaPerumalTemple);

        mKailasanatharTemple=mMap.addMarker(new MarkerOptions()
        .position(KailasanatharTemple)
        .title("Kailasanathar Temple"));
        mKailasanatharTemple.setTag(0);
        markerList.add(mKailasanatharTemple);

        mkamakshiAmmanTemple=mMap.addMarker(new MarkerOptions()
        .position(KamakshiAmmanTemple)
        .title("Kamakshi Ammman Temple"));
        mkamakshiAmmanTemple.setTag(0);
        markerList.add(mkamakshiAmmanTemple);

        mKachabeshwarTemple=mMap.addMarker(new MarkerOptions()
        .position(KachabeshwarTemple)
        .title("Kachabeshwarar Temple"));
        mKachabeshwarTemple.setTag(0);
        markerList.add(mKachabeshwarTemple);

        mAdhiKamakshiAmman=mMap.addMarker(new MarkerOptions()
         .position(AdhiKamakshiAmman)
         .title("Adhi kamakshi Amman Temple"));
        mAdhiKamakshiAmman.setTag(0);
        markerList.add(mAdhiKamakshiAmman);

        mChitraguptaTemple=mMap.addMarker(new MarkerOptions()
        .position(ChitraguptaTemple)
        .title("Chitragupta Temple"));
        mChitraguptaTemple.setTag(0);
        markerList.add(mChitraguptaTemple);

        mEkambareswararTemple=mMap.addMarker(new MarkerOptions()
        .position(EkambareswararTemple)
        .title("Ekambareshwarar Temple"));
        mEkambareswararTemple.setTag(0);
        markerList.add(mEkambareswararTemple);

        mSankaraMutt=mMap.addMarker(new MarkerOptions()
        .position(SankaraMutt)
        .title("Sri Kanchi Kamakoti Peetham"));
        mEkambareswararTemple.setTag(0);
        markerList.add(mSankaraMutt);


        //For looop for display

        for(Marker m : markerList)
        {

           LatLng latlng = new LatLng(m.getPosition().latitude,m.getPosition().longitude);
           mMap.addMarker(new MarkerOptions()
                   .position(latlng)
                   .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
           mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng,13));


        }








        /*
        // Add a marker in Sydney and move the camera
        LatLng sankaraMutt = new LatLng(12.843296, 79.700632);
        mMap.addMarker(new MarkerOptions().position(sankaraMutt).title("Marker in Sri Kanchi kamakoti peetam")
        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sankaraMutt,10));

        */

    }
}

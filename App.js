import React, {useEffect} from 'react';
import {Text, View} from 'react-native';
import LottieSplashScreen from 'react-native-lottie-splash-screen';

const App = () => {
  useEffect(() => {
    setTimeout(() => {
      LottieSplashScreen.hide();
    }, 3000);
  }, []);
  return (
    <View
      style={{
        backgroundColor: 'white',
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
      }}>
      <Text style={{color: '#000', fontSize: 20, fontWeight: 'bold'}}>
        Welcome Animated Application
      </Text>
    </View>
  );
};

export default App;

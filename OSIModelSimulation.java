class ApplicationLayer {
    public static String sendData(String data) {
        System.out.println("Application Layer: Sending data to Presentation Layer" + data);
        return data;
    }
    
    public static String receiveData(String data) {
        System.out.println("Application Layer: Receiving data from Presentation Layer" + data);
        return data;
    }
}

class PresentationLayer {
    public static String encodeData(String data) {
        System.out.println("Presentation Layer: Encoding data");
        return data;
    }
    
    public static String decodeData(String data) {
        System.out.println("Presentation Layer: Decoding data");
        return data;
    }
}

class SessionLayer {
    public static String addSessionInfo(String data) {
        System.out.println("Session Layer: Adding session information");
        return data;
    }
    
    public static String removeSessionInfo(String data) {
        System.out.println("Session Layer: Removing session information");
        return data;
    }
}

class TransportLayer {
    public static String addPortNumbers(String data) {
        System.out.println("Transport Layer: Adding port numbers");
        return data;
    }
    
    public static String removePortNumbers(String data) {
        System.out.println("Transport Layer: Removing port numbers");
        return data;
    }
}

class NetworkLayer {
    public static String addIPAddress(String data) {
        System.out.println("Network Layer: Adding IP address");
        return data;
    }
    
    public static String removeIPAddress(String data) {
        System.out.println("Network Layer: Removing IP address");
        return data;
    }
}

class DataLinkLayer {
    public static String addHeaderAndTrailer(String data) {
        System.out.println("Data Link Layer: Adding header and trailer");
        return data;
    }
    
    public static String removeHeaderAndTrailer(String data) {
        System.out.println("Data Link Layer: Removing header and trailer");
        return data;
    }
}

class PhysicalLayer {
    public static String encodeIntoBits(String data) {
        System.out.println("Physical Layer: Encoding data into bits");
        return data;
    }
    
    public static String decodeFromBits(String data) {
        System.out.println("Physical Layer: Decoding data from bits");
        return data;
    }
}

public class OSIModelSimulation {
    public static void main(String[] args) {
        // Message to be sent
        String message = "Hello, OSI!";
        
        // Application Layer
        message = ApplicationLayer.sendData(message);
        message = ApplicationLayer.receiveData(message);
        
        // Presentation Layer
        message = PresentationLayer.encodeData(message);
        message = PresentationLayer.decodeData(message);
        
        // Session Layer
        message = SessionLayer.addSessionInfo(message);
        message = SessionLayer.removeSessionInfo(message);
        
        // Transport Layer
        message = TransportLayer.addPortNumbers(message);
        message = TransportLayer.removePortNumbers(message);
        
        // Network Layer
        message = NetworkLayer.addIPAddress(message);
        message = NetworkLayer.removeIPAddress(message);
        
        // Data Link Layer
        message = DataLinkLayer.addHeaderAndTrailer(message);
        message = DataLinkLayer.removeHeaderAndTrailer(message);
        
        // Physical Layer
        message = PhysicalLayer.encodeIntoBits(message);
        message = PhysicalLayer.decodeFromBits(message);
    }
}

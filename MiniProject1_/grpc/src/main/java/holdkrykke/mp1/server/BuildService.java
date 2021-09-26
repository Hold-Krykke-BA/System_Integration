package holdkrykke.mp1.server;


import holdkrykke.mp1.RegisterServiceGrpc;
import holdkrykke.mp1.RegisterStudypointsRequest;
import holdkrykke.mp1.StudypointResponse;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class BuildService extends RegisterServiceGrpc.RegisterServiceImplBase
{
      @Override
      public void register(RegisterStudypointsRequest request, StreamObserver<StudypointResponse> responseObserver) {
            System.out.println("Request received from client:\n" + request);

            String archivedInfo = archiveData(request) + " studypoints assigned to " + request.getStudentID();
            StudypointResponse response = StudypointResponse.newBuilder()
                    .setArchivedInfo(archivedInfo)
                    .build();
            
            responseObserver.onNext(response);
            responseObserver.onCompleted();
      }

      private String archiveData(RegisterStudypointsRequest request) {
            PrintWriter writer = null;
            String path = "src/main/resources/" + request.getStudentID() +".txt";
            File tmpDir = new File(path);
            boolean exists = tmpDir.exists();
            try {
                  writer = new PrintWriter(new FileOutputStream(path, true));
            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            }
            if(!exists){
                  writer.append("AssignmentID Assignment Review Studypoints\n");
            }
            writer.append(request.getAssignmentID() + " " +
                    toBoolean(request.getAssignmentCompleted()) + " " +
                    toBoolean(request.getReviewCompleted()) + " " +
                    getStudypoints(toBoolean(request.getAssignmentCompleted()), toBoolean(request.getReviewCompleted())) + "\n");
            writer.close();
            return getStudypoints(toBoolean(request.getAssignmentCompleted()), toBoolean(request.getReviewCompleted()));
      }

      private String getStudypoints(boolean assignment, boolean review){
            int result = 0;
            if (assignment) result = result + 10;
            if (review) result = result + 5;
            return Integer.toString(result);
      }

      private Boolean toBoolean(String toBool){
            if(Integer.parseInt(toBool) == 0) return false;
            else return true;
      }
}

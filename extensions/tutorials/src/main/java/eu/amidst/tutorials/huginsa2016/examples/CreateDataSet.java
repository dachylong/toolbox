package eu.amidst.tutorials.huginsa2016.examples;

import eu.amidst.core.datastream.DataStream;
import eu.amidst.core.io.DataStreamWriter;
import eu.amidst.dynamic.datastream.DynamicDataInstance;
import eu.amidst.dynamic.utils.DataSetGenerator;


/**
 * Created by rcabanas on 20/05/16.
 */
public class CreateDataSet {

    public static void main(String[] args) throws Exception{
        int nOfDisc;
        int nOfCont;
        DataStream<DynamicDataInstance> dataGaussians = null;
        String path = "datasets/simulated/";



        nOfCont = 3;
        nOfDisc = 2;
        dataGaussians = DataSetGenerator.generate(1,1000,nOfDisc,nOfCont);
        DataStreamWriter.writeDataToFile(dataGaussians, path+"exampleDS_d"+nOfDisc+"_c"+nOfCont+".arff");

        nOfCont = 5;
        nOfDisc = 0;
        dataGaussians = DataSetGenerator.generate(1,1000,nOfDisc,nOfCont);
        DataStreamWriter.writeDataToFile(dataGaussians, path+"exampleDS_d"+nOfDisc+"_c"+nOfCont+".arff");


        nOfCont = 0;
        nOfDisc = 5;
        dataGaussians = DataSetGenerator.generate(1,1000,nOfDisc,nOfCont);
        DataStreamWriter.writeDataToFile(dataGaussians, path+"exampleDS_d"+nOfDisc+"_c"+nOfCont+".arff");



    }

}
